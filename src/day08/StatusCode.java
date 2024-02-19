package day08;

public class StatusCode {
    public static void main(String[] args) {
        int statusCode=440;
        System.out.println("Solution 1: use ternary");
        String meanings=(statusCode==200)?"ok":(statusCode==201)?"created":(statusCode==202)?"accepted"
                :(statusCode==301)?"Moved Permanently":(statusCode==303)?"see other"
                :(statusCode==304)?"not modified":(statusCode==307)?"Temporary Redirect"
                :(statusCode==400)?"Bad Request":(statusCode==401)?"Unauthorized"
                :(statusCode==403)?"Forbidden" :(statusCode==404)?"Not Found":(statusCode==410)?"Gone"
                :(statusCode==500)?"Internal Server Error":(statusCode==503)?"Service Unavailable"
                :"please enter valid status code";
        System.out.println("status code = "+statusCode+", its meaning: "+meanings);


        System.out.println("Solution 2: use the switch statement");
        String result="";
        switch (statusCode){
            case 200:
                result="ok";
                break;
            case 201:
                result="Created";
                break;
            case 202:
                result="Accepted";
                break;
            case 301:
                result="Moved Permanently";
                break;
            case 303:
                result="See Other";
                break;
            case 304:
                result="Not Modified";
                break;
            case 307:
                result="Temporary Redirect";
                break;
            case 400:
                result="Bad Request";
                break;
            case 401:
                result="Unauthorized";
                break;
            case 403:
                result="Forbidden";
                break;
            case 404:
                result="Not Found";
                break;
            case 410:
                result="Gone";
                break;
            case 500:
                result="Internal Server Error";
                break;
            case 503:
                result="Service Unavailable";
                break;
            default:
                result="please enter valid status code";
        }
        System.out.println("status code = "+statusCode+", its meaning: "+result);

    }
}
/*
HTTP is the protocol that governs communications between web servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:
            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use the switch statement
 */