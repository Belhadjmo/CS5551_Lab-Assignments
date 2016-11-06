var request = require('request');
request('https://gateway-a.watsonplatform.net/calls/data/GetNews?apikey=belhadjmo75Miloud2010464&outputMode=json&start=now-1d&end=now&count=100&q.enriched.url.enrichedTitle.relations.relation=|action.verb.text=acquire,object.entities.entity.type=Company|&return=enriched.url.title
', function (error, response, body) {
    //Check for error
    if(error){
        return console.log('Error:', error);
    }

    //Check for right status code
    if(response.statusCode !== 200){
        return console.log('Invalid Status Code Returned:', response.statusCode);
    }
//	console.log(body);
    //All is good. Print the body
    body = JSON.parse(body);
	var ven = body.response.venues;
	var i;
	for(i=0;i<ven.length;i++)
	{
		console.log(ven[i].name);
	}
	
});