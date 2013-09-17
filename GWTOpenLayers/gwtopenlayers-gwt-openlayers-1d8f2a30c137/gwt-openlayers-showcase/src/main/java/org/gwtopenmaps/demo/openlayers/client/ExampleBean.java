package org.gwtopenmaps.demo.openlayers.client;

import org.gwtopenmaps.demo.openlayers.client.basic.AbstractExample;

/**
 * One example
 *
 * @author Frank
 *
 */
public class ExampleBean implements Comparable<ExampleBean> {

    private String name;
    private String description;
    private String[] tags;
    private AbstractExample example;

    /**
     * Constructs an example.
     *
     * @param name
     * @param description
     * @param tags
     */
    public ExampleBean(String name, String description, String[] tags,
                       AbstractExample example) {
        super();
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.example = example;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    /**
     * @return the example
     */
    public AbstractExample getExample() {
        return example;
    }

    /**
     * @param example the example to set
     */
    public void setExample(AbstractExample example) {
        this.example = example;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(ExampleBean o) {
        return this.getName().compareTo(o.getName());
    }
}
