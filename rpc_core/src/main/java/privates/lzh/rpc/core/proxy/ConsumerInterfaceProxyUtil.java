package privates.lzh.rpc.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/***
 * Ϊconsumer�ӿ����ɴ���
 * @author LZH
 *
 */
public class ConsumerInterfaceProxyUtil 
{
	public static Object newProxyInstance(ClassLoader loader, Class<?> clazz, InvocationHandler h)
	{
		Object obj = Proxy.newProxyInstance(loader, new Class[]{clazz}, h);
		return obj;
	}
}
