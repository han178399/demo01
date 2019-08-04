package haoke.dubbo.server.service.impl;

import haoke.dubbo.server.pojo.HouseResources;
import haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author hanhanhan
 * @Date 2019/8/2 0002 19:19
 */
@Transactional
@Service
public class HouseResourcesImpl extends BaseServiceImpl implements HouseResourcesService {
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        if(StringUtils.isBlank(houseResources.getTitle())){
            return -1;
        }

        return super.save(houseResources);
    }
}
