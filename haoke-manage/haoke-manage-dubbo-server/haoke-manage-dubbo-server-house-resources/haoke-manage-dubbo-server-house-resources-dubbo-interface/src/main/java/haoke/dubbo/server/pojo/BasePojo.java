package haoke.dubbo.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author hanhanhan
 * @Date 2019/8/2 0002 18:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePojo implements Serializable {
    private Date created;
    private Date update;

    public void setUpdated(Date created) {
    }
}
