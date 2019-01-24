package site.ilemon.sharding.algorithm;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * user表分表策略
 * @author andy
 *
 */
public class UserTableShardingStrategy implements PreciseShardingAlgorithm<Integer>{

	@Override
	public String doSharding(Collection<String> list,
			PreciseShardingValue<Integer> shardingValue) {
		for (String each : list) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
		throw new UnsupportedOperationException();
	}


}
