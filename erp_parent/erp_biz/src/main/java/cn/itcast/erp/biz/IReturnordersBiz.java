package cn.itcast.erp.biz;
import cn.itcast.erp.entity.Returnorders;
/**
 * 退货订单业务逻辑层接口
 * @author Administrator
 *
 */
public interface IReturnordersBiz extends IBaseBiz<Returnorders>{
	void doCheck(Long uuid, Long empuuid);
	void doReturn(Long ordersuuid, Long empuuid);
}

