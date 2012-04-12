package arch.datasource3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import arch.datasourceinterface.DefaultDataItem;
import arch.datasourceinterface.IDataItem;
import arch.datasourceinterface.IDataSource;

public class DataSource3 implements IDataSource {

    private static String[] companies = { "BMW", "Chrysler", "Ford" };

    private List<IDataItem> itemsList = null;

    public List<IDataItem> getData() {
        if (this.itemsList != null)
            return this.itemsList;
        this.itemsList = new ArrayList<IDataItem>();

        Random r = new Random();

        for (int i = 0; i < companies.length; i++) {
            IDataItem di = new DefaultDataItem(companies[i], (int) (r.nextFloat() * 100000));
            di.setArea(getArea());
            this.itemsList.add(di);
        }

        return this.itemsList;
    }

    public String getArea() {
        return "USA";
    }
}
