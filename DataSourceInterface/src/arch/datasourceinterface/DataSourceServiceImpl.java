package arch.datasourceinterface;

import java.util.ArrayList;
import java.util.List;

public class DataSourceServiceImpl implements IDataSourceService {
	private List<IDataSource> dataSourceList = new ArrayList<IDataSource>();
	
	@Override
	public void addDataSource(IDataSource dataSource) {
		if ( !dataSourceList.contains(dataSource) )
			dataSourceList.add(dataSource);
	}
	
	@Override
	public List<IDataSource> getDataSources() {
		return dataSourceList;
	}
}
