package arch.dataaggregator1;

import java.util.ArrayList;
import java.util.List;

import arch.dataaggregatorinterface.DataAggregator;
import arch.datasourceinterface.IDataItem;
import arch.datasourceinterface.IDataSource;

final public class IdentityDataAggregator extends DataAggregator {

    @Override
    public List<IDataItem> get() {
        List<IDataItem> itemList = new ArrayList<IDataItem>();

        for (int dataSourceIdx = 0; dataSourceIdx < this.dataSources.size(); dataSourceIdx++) {
            IDataSource dataSource = this.dataSources.get(dataSourceIdx);

            List<IDataItem> dataSourceList = dataSource.getData();
            for (int dataSourceItemsIdx = 0; dataSourceItemsIdx < dataSourceList.size(); dataSourceItemsIdx++)
                itemList.add(dataSourceList.get(dataSourceItemsIdx));
        }

        return itemList;
    }

	@Override
	public String getType() {
		return "identity";
	}
}
