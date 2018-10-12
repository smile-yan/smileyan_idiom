package cn.smileyan.springboot.smileyan_idiom.entity;

public class Cy {
    private int id;

    private String name;
    private String spell;
    private String content;
    private String derivation;
    private String samples;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public String getSamples() {
        return samples;
    }

    public void setSamples(String samples) {
        this.samples = samples;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
