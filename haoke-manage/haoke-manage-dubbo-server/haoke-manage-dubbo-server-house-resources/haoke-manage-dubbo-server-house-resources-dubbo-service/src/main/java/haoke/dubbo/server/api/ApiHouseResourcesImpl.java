package haoke.dubbo.server.api;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import haoke.dubbo.server.pojo.HouseResources;
import haoke.dubbo.server.service.HouseResourcesService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author hanhanhan
 * @Date 2019/8/2 0002 19:23
 */
@Service(version = "1.0.0")
public class ApiHouseResourcesImpl implements ApiHouseResourcesService{
    @Autowired
    private HouseResourcesService houseResourcesService;
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        return this.houseResourcesService.saveHouseResources(houseResources);
    }
}
