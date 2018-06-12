package privates.lzh.rpc.core.consumer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/***
 * 
 * @author lzh
 *
 */
public class ConsumerRPCManager implements BeanDefinitionRegistryPostProcessor 
{
	// RPC interface package to be scanned
	private String scanPack;
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException 
	{
		
	}

	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException 
	{
		System.out.println("....postprocessor....");
		BeanDefinition definition = new RootBeanDefinition();
		definition.setLazyInit(false);
		definition.setScope("singleton");
		
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
