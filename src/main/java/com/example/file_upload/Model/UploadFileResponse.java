package com.example.file_upload.Model;

public class UploadFileResponse {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFileResponse() {
    }

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    /**
     * @return String return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return String return the fileDownloadUri
     */
    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    /**
     * @param fileDownloadUri the fileDownloadUri to set
     */
    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    /**
     * @return String return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return long return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(long size) {
        this.size = size;
    }

}
