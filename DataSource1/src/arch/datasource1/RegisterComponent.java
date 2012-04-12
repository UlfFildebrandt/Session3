package arch.datasource1;

import arch.datasourceinterface.IDataSourceService;

public class RegisterComponent {
    protected void setDataSourceService(IDataSourceService dataSourceService) {
    	dataSourceService.addDataSource(new DataSource1());     
    }

    protected void unsetDataSourceService(IDataSourceService dataSourceService) {
    }
}
