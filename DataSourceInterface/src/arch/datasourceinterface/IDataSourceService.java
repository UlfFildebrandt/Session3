package arch.datasourceinterface;

import java.util.List;

public interface IDataSourceService {
	
	public void addDataSource(IDataSource dataSource);
	public List<IDataSource> getDataSources();
}
