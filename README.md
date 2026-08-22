# Portfolio Backend — Javier del Cerro de Nava

Backend real en Spring Boot que sirve de "laboratorio interactivo" para `primeofstudio.com`.
Cada endpoint del laboratorio ejecuta código Java de verdad, protegido con Spring Security
y JWT, y documentado con OpenAPI/Swagger.

## Estructura

```
com.javiercerro.portfolio
├── security/    JWT + Spring Security
├── banking/     API bancaria contract-first, CRUD completo — ES LO ÚNICO QUE CONSUME EL FRONTEND
├── migration/   ejemplo de migración MuleSoft -> Java (código real, no expuesto ya en la web)
└── patterns/    Factory, Singleton, Observer, Strategy, Command, State, Builder
                 Java puro, sin Spring: se muestran en el portfolio de forma visual, no se ejecutan
```

## Endpoints (banking)

| Método | Ruta | Auth | Qué hace |
|---|---|---|---|
| GET | `/api/banking/accounts` | No | Lista todas las cuentas |
| GET | `/api/banking/accounts/{accountId}` | No | Consulta una cuenta |
| POST | `/api/banking/accounts` | JWT | Crea una cuenta |
| PUT | `/api/banking/accounts/{accountId}` | JWT | Modifica una cuenta |
| DELETE | `/api/banking/accounts/{accountId}` | JWT | Elimina una cuenta |
| POST | `/api/banking/payments` | JWT | Crea un pago |
| GET | `/api/banking/contract` | No | YAML del contrato OpenAPI |
| POST | `/api/auth/demo-token` | No | Emite un JWT de invitado |
| GET | `/swagger-ui.html` | No | Documentación interactiva |

## Ejecutar en local

```bash
mvn spring-boot:run
```

API en `http://localhost:8080`, Swagger en `http://localhost:8080/swagger-ui.html`.

---

## Desplegar en primeofstudio.com — paso a paso

### 1. Sube el código a GitHub
Crea un repositorio (por ejemplo `portfolio-backend`) y sube todo este proyecto,
incluido el `Dockerfile` que ya está en la raíz.

### 2. Backend en Render (gratis)
1. Ve a [render.com](https://render.com) y crea una cuenta (puedes entrar con GitHub).
2. **Dashboard → "New +" → "Web Service"**.
3. Conecta tu cuenta de GitHub y selecciona el repositorio del backend.
4. En "Environment" / "Runtime" elige **Docker** — Render detectará el `Dockerfile`
   automáticamente y no hace falta que rellenes "Build Command" ni "Start Command".
5. En "Instance Type" elige **Free**.
6. Pulsa "Create Web Service". La primera build tarda unos minutos (está compilando
   con Maven dentro del contenedor).
7. Cuando termine, tendrás una URL tipo `https://portfolio-backend-xxxx.onrender.com`.
   Pruébala abriendo `https://portfolio-backend-xxxx.onrender.com/swagger-ui.html`.

> **Importante:** el plan gratuito de Render "duerme" el servicio tras 15 minutos sin
> tráfico. La primera petición después de dormir tarda 30-60 segundos en responder —
> es normal, no es un error ni un fallo tuyo.

### 3. Apunta api.primeofstudio.com a Render
1. En el panel DNS de donde compraste `primeofstudio.com` (Namecheap, GoDaddy, IONOS...),
   añade un registro **CNAME**: host `api`, valor `portfolio-backend-xxxx.onrender.com`
   (sin `https://`).
2. En Render, dentro de tu servicio: **Settings → Custom Domains → Add Custom Domain**,
   escribe `api.primeofstudio.com` y sigue sus instrucciones (puede pedir un registro
   TXT adicional para verificar que el dominio es tuyo).
3. Espera la propagación (de minutos a un par de horas) y prueba
   `https://api.primeofstudio.com/swagger-ui.html`.

### 4. Frontend en Vercel (gratis)
1. Antes de subirlo, edita `index.html` y cambia el valor por defecto del campo
   `id="backend-url"` de `http://localhost:8080` a `https://api.primeofstudio.com`.
2. Sube `index.html` a otro repositorio de GitHub (o arrástralo directamente en
   [vercel.com](https://vercel.com), sin necesidad de Git).
3. En Vercel: **Add New… → Project**, importa el repo (o usa el drag-and-drop).
   Al ser HTML puro no hace falta configurar ningún build.
4. Deploy. Te dará una URL tipo `tu-proyecto.vercel.app`.

### 5. Apunta primeofstudio.com a Vercel
1. En Vercel, dentro del proyecto: **Settings → Domains**, añade `primeofstudio.com`
   y `www.primeofstudio.com`.
2. Vercel te indica exactamente qué registros crear (normalmente un `A` para el
   dominio raíz y un `CNAME` para `www`). Créalos en el panel DNS de tu dominio.

### 6. Verificación final
- `https://primeofstudio.com` → tu portfolio.
- `https://api.primeofstudio.com/api/banking/accounts` → debe devolver `[]`
  (una lista vacía en JSON es la respuesta correcta: no hay cuentas creadas todavía).

### CORS
`SecurityConfig` ya permite como origen `https://primeofstudio.com` y
`https://www.primeofstudio.com` por defecto. Si usas otro dominio distinto,
añádelo en `SecurityConfig.corsConfigurationSource()` y vuelve a desplegar.
