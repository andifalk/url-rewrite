package com.example.urlrewrite;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Properties for rewrite url mappings.
 */
@Validated
@Configuration
@ConfigurationProperties(prefix = "rewrite")
public class RewriteProperties {

    private List<Entry> entries = new ArrayList<>();

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    /**
     * One rewrite url mapping.
     */
    public static class Entry {

        @NotNull
        private String sourceUrl;

        @NotNull
        private String target;

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }
    }
}
