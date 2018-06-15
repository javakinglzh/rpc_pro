package privates.lzh.rpc.core.consumer;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/***
 * 动态注册RPC接口的BeanDefinition
 * @author lzh
 *
 */
public class ConsumerRPCManager implements BeanDefinitionRegistryPostProcessor 
{
	// RPC interface package to be scanned
	private String scanPack;
	private Map<String, String> rpcServices;
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException 
	{
		
	}

	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException 
	{
		System.out.println("....register start....");
		
		Set<Entry<String, String>> entrySet = rpcServices.entrySet();
		for(Entry<String, String> entry:entrySet)
		{
			String name      = entry.getKey();
			String className = entry.getValue();
			try 
			{
				Class<?> clazz = Class.forName(className);
				RootBeanDefinition definition = new RootBeanDefinition();
				definition.setBeanClass(ConsumerBeanFactory.class);
				definition.setLazyInit(true);
				definition.setScope(BeanDefinition.SCOPE_SINGLETON);
				definition.getPropertyValues().addPropertyValue("clazz", clazz);
				registry.registerBeanDefinition(name, definition);
				System.out.println("....register class : " + clazz);
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("....register end....");
	}
	
	public Map<String, String> getRpcServices() 
	{
		return rpcServices;
	}

	public void setRpcServices(Map<String, String> rpcServices) 
	{
		this.rpcServices = rpcServices;
	}

	public String getScanPack() 
	{
		return scanPack;
	}

	public void setScanPack(String scanPack) 
	{
		this.scanPack = scanPack;
	}
}
