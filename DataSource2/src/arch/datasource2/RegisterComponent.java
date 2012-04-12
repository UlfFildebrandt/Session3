package arch.datasource2;

import arch.datasourceinterface.IDataSourceService;

public class RegisterComponent {
    protected void setDataSourceService(IDataSourceService dataSourceService) {
    	dataSourceService.addDataSource(new DataSource2()); 
    }

    protected void unsetDataSourceService(IDataSourceService dataSourceService) {
    }
}
