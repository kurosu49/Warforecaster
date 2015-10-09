package team14.model;

public class ComboItem
{
    private String key;
    private int value;

    public ComboItem(String key, int value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public int getValue()
    {
        return value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComboItem other = (ComboItem) obj;
        if ((this.value == 0) ? (other.value != 0) : !(this.value == other.value)) {
            return false;
        }
        return true;
    }
    


}