
package vp.androidallinoneexample.retrofitstudent.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Books {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("status_message")
    @Expose
    private String statusMessage;
    @SerializedName("data")
    @Expose
    private Integer data;

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * 
     * @param statusMessage
     *     The status_message
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Integer getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Integer data) {
        this.data = data;
    }

}
