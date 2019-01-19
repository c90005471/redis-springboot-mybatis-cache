package com.aaa.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.aaa.util.RedisCacheTransfer;

import redis.clients.jedis.JedisPoolConfig;

/**
 * @author TeacherChen
 * @description redis相关的配置
 * @company AAA软件
 * @classname Qy78 2018-7-10上午10:01:07
 */
@Configuration
@PropertySource("classpath:redis.properties")
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
	private int maxIdle;
	private int maxTotal;
	private int minEvictableIdleTimeMillis;
	private int numTestsPerEvictionRun;
	private int timeBetweenEvictionRunsMillis;
	private int maxWaitMillis;
	private boolean testOnBorrow;
	private String hostName;
	private int port;
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	/**
	 * 
	 * TODO配置poolConfigbean
	 * 
	 * @return 2018-7-10上午10:06:44
	 */
	@Bean
	public JedisPoolConfig getPoolConfig() {
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxIdle(maxIdle);
		jpc.setMaxTotal(maxTotal);
		jpc.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		jpc.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		jpc.setMaxWaitMillis(maxWaitMillis);
		jpc.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
		jpc.setTestOnBorrow(testOnBorrow);
		return jpc;
	}
	/**
	 * 创建Spring-redis连接池管理工厂 类（bean）
	 *TODO 
	 *@return
	 *2018-7-11下午1:56:23
	 */
     @Bean
	public  JedisConnectionFactory getJedisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory= new JedisConnectionFactory();
		jedisConnectionFactory.setHostName(hostName);
		jedisConnectionFactory.setPort(port);
		jedisConnectionFactory.setPoolConfig(getPoolConfig());
		return jedisConnectionFactory;

	}
	/**
	 * 使用中间类解决RedisCache.jedisConnectionFactory的静态注入，从而使MyBatis实现第三方缓存
	 *TODO 
	 *@return
	 *2018-7-11下午2:00:30
	 */
     @Bean
	public  RedisCacheTransfer getRedisCache() {
		RedisCacheTransfer redisCacheTransfer= new RedisCacheTransfer();
		redisCacheTransfer.setJedisConnectionFactory(getJedisConnectionFactory());
		return redisCacheTransfer;

	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public int getNumTestsPerEvictionRun() {
		return numTestsPerEvictionRun;
	}

	public void setNumTestsPerEvictionRun(int numTestsPerEvictionRun) {
		this.numTestsPerEvictionRun = numTestsPerEvictionRun;
	}

	public int getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(
			int timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public int getMaxWaitMillis() {
		return maxWaitMillis;
	}

	public void setMaxWaitMillis(int maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}

	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

}
