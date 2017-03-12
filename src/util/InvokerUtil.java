package hackathon;

public class InvokerUtil {

	public static String getInvokeQuery(String function,String from,String to ,String queryValue){
		String hackathonQuery = "{"
				+"		     \"jsonrpc\": \"2.0\",                                                                  "
				+"		     \"method\": \"invoke\",                                                                "
				+"		     \"params\": {                                                                          "
				+"		         \"type\": 1,                                                                       "
				+"		         \"chaincodeID\": {                                                                 "
				+"		             \"path\": \"https://github.com/YESPPG/learn-chaincode/blob/master/finished\"    "
				+"		         },                                                                                 "
				+"		         \"ctorMsg\": {                                                                     "
				+"		             \"function\": \""+function+"\",                                                        "
				+"		             \"args\": [                                                                    "
				+"		                 \""+from+"\",                                                                     "
				+"		                 \""+to+"\",                                                                     "
				+"		                 \""+queryValue+"\"                                                                    "
				+"		             ]                                                                              "
				+"		         },                                                                                 "
				+"		         \"secureContext\": \"admin\"                                                       "
				+"		     },                                                                                     "
				+"		     \"id\": 1	      																		"																			
				+"		 }";
		return hackathonQuery;
		
	}
	
	public static String getInvokeResult(String function,String key,String type){
		String hackathonResult = "{"
				+"		     \"jsonrpc\": \"2.0\",                                                                  "
				+"		     \"method\": \"invoke\",                                                                "
				+"		     \"params\": {                                                                          "
				+"		         \"type\": 1,                                                                       "
				+"		         \"chaincodeID\": {                                                                 "
				+"		             \"path\": \"https://github.com/YESPPG/learn-chaincode/blob/master/finished\"    "
				+"		         },                                                                                 "
				+"		         \"ctorMsg\": {                                                                     "
				+"		             \"function\": \""+function+"\",                                                        "
				+"		             \"args\": [                                                                    "
				+"		                 \""+type+"-"+key+"\"                                                                     "
				+"		             ]                                                                              "
				+"		         },                                                                                 "
				+"		         \"secureContext\": \"admin\"                                                       "
				+"		     },                                                                                     "
				+"		     \"id\": 1	      																		"																			
				+"		 }";
		return hackathonResult;
	}
}
