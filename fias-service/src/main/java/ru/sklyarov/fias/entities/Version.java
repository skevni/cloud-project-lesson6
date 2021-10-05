package ru.sklyarov.fias.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Version {
    @JsonAlias("VersionId")
    private long versionId;

    @JsonProperty("TextVersion")
    protected String textVersion;

    @JsonProperty("GarXMLDeltaURL")
    protected String diffDownloadUrl;

    @JsonAlias("GarXMLFullURL")
    protected String downloadUrl;

    public Version() {
    }

    public long getVersionId() {
        return versionId;
    }

    public void setVersionId(long versionId) {
        this.versionId = versionId;
    }

    public String getTextVersion() {
        return textVersion;
    }

    public void setTextVersion(String textVersion) {
        this.textVersion = textVersion;
    }

    public String getDiffDownloadUrl() {
        return diffDownloadUrl;
    }

    public void setDiffDownloadUrl(String diffDownloadUrl) {
        this.diffDownloadUrl = diffDownloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
