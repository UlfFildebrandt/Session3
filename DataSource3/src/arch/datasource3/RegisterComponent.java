package arch.datasource3;

import arch.datasourceinterface.IDataSourceService;

public class RegisterComponent {
    protected void setDataSourceService(IDataSourceService dataSourceService) {
    	dataSourceService.addDataSource(new DataSource3()); 
    }

    protected void unsetDataSourceService(IDataSourceService dataSourceService) {
    }
}
