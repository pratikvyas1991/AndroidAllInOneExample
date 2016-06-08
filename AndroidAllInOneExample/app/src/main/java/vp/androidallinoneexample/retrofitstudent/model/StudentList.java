
package vp.androidallinoneexample.retrofitstudent.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentList {

    private Integer result;
    private List<Student> data = new ArrayList<Student>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<Student> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<Student> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
