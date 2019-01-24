package site.ilemon.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.ilemon.entity.Receiving;

/**
 * 收货人dao层接口
 * @author andy
 */
@Repository
public interface IReceivingDao {

	
	public List<Receiving> listReceivings();
	
	public int insert(Receiving receiving);
}
