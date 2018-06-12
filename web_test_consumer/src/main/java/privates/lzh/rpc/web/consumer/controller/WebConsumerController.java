package privates.lzh.rpc.web.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import privates.lzh.rpc.web.consumer.common.ServerResponse;

/**
 * invoke rpc controller
 *
 */
@Controller
public class WebConsumerController
{
    /**
     * invoke rpc test
     */
    @RequestMapping(value = "/rpctest")
    @ResponseBody     
    public ServerResponse<String> rpcTest()
    {
    	System.out.println("this is web_test_consumer");
    	ServerResponse<String> res = new ServerResponse<String>();
    	res.setDesc("invoke success");
    	return res;
    }
}
