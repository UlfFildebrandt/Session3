package arch.datadisplay.ui.internal;

import java.util.ArrayList;
import java.util.List;

import arch.datasourceinterface.IDataSource;

public class TableObject {
    private String type;
    private String title;
    private StringBuilder buffer;

    private List<IDataSource> dataSources = new ArrayList<IDataSource>();

    public TableObject(String type, String title, StringBuilder buffer) {
        super();
        this.type = type;
        this.title = title;
        this.buffer = buffer;
    }

    public String getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public StringBuilder getBuffer() {
        return this.buffer;
    }

    public void addDataSource(IDataSource ds) {
        this.dataSources.add(ds);
    }
    
    public void addDataSources(List<IDataSource> ds) {
    	this.dataSources.addAll(ds);
    }

    public List<IDataSource> getDataSources() {
        return this.dataSources;
    }

}
