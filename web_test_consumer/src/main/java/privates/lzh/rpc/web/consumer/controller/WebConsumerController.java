package privates.lzh.rpc.web.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import privates.lzh.rpc.api.model.UserInfo;
import privates.lzh.rpc.api.service.IUserService;
import privates.lzh.rpc.web.consumer.common.ServerResponse;

/**
 * invoke rpc controller
 *
 */
@Controller
public class WebConsumerController
{
    /**
     * invoke RPC test
     */
	@Autowired
	IUserService userServie;
    @RequestMapping(value = "/rpctest")
    @ResponseBody     
    public ServerResponse<String> rpcTest()
    {
    	System.out.println("...web consumer controller...");
    	
    	UserInfo info = new UserInfo();
    	info.setAge(10);
    	info.setName("lzh");
    	int result = userServie.addUser(info);
    	
    	String desc = result==0 ? "add Success": "add fail";
    	ServerResponse<String> res = new ServerResponse<String>();
    	res.setDesc(desc);
    	res.setId(result);
    	return res;
    }
}
