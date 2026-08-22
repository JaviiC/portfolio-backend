package com.javiercerro.portfolio.patterns.builder;

/**
 * BUILDER.
 * Construcción de un objeto complejo paso a paso: cada método devuelve
 * "this" para poder encadenar llamadas, y el objeto final solo existe
 * una vez llamado build().
 */
public class ReportBuilder {
    private String title;
    private String body;
    private String footer;

    public ReportBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ReportBuilder withBody(String body) {
        this.body = body;
        return this;
    }

    public ReportBuilder withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public Report build() {
        return new Report(title, body, footer);
    }
}
