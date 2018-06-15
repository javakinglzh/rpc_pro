package privates.lzh.rpc.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * consumer接口动态代理
 * @author LZH
 *
 */
public class ConsumerInvokeHandler implements InvocationHandler 
{

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		System.out.println("this is an invocation handler");
		return null;
	}

}
