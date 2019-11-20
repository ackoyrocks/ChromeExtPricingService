
$(document).ready(function(){
hdprice = $(".pReg").attr("content");  // get the value of price
var modelNoComplete = $(".brandModelInfo").find(".modelNo").html(); 
var modelNo = (modelNoComplete.substring(modelNoComplete.lastIndexOf('#')+1, modelNoComplete.length));
var was = $(".pricingReg").find(".pricingStrikeThru").eq(0).text(); 
var specialBuy = $(".pricingReg").find(".pricingStrikeThru").eq(1).text(); 
var savingText =  encodeURIComponent($(".savingsText").text());
var freeDelivery = $(".col-12 col-md-6 col-lg-4").text();
var brand = $(".product-title").find(".product-title__brand").eq(0).text() ;
var productDesc = $(".product-title__title").text();
var storeNumber = $(".MyStore__store").text();
console.log(was);
console.log(specialBuy);
console.log(savingText);
console.log(brand);
console.log(productDesc);
console.log(storeNumber);
var productData = getItem(modelNo,hdprice, was, specialBuy, savingText, brand, productDesc,storeNumber);
});

function getItem(modelNo,hdprice, was, specialBuy, savingText, brand, productDesc,storeNumber)
{
  $.ajax({
    type: "POST",
    
  url: "http://localhost:8080/PriceRestService/productPrice/?modelNo="+ modelNo +"&hdprice="+hdprice+"&was="+was+"&specialBuy="+specialBuy+"&savingText="+savingText+"&brand="+brand+"&productDesc="+productDesc+"&storeNumber="+storeNumber+"&price7=299.20&price8=299.20&price9=good&price10=1299.20",
  }).done(function (data) {
 
if(data.noShow == 'Y')
{
  var lowesProduct = "https://www.lowes.com"+data.LowesProductUrl;
    var lowesspecification  = data.LowesProductUrl.split('/')[2];
     var lowesspecificationsub = ''
     if(lowesspecification.length > 71)
     {
      lowesspecificationsub = lowesspecification.substring(0, 71) + "...";
     }
     else
     {
      lowesspecificationsub = lowesspecification;
     } 
	 
	 var homelogoblack="https://www.lowes.com/images/logos/2016_lowes_logo/lowes_logo_black/lowes_logo_black.png";
var homelogoblue="https://www.lowes.com/images/logos/2016_lowes_logo/lowes_logo_rgb/LLowesLogo2016_Vertical_RGB.png";
 
  //$('body').prepend("<html><head></head><body><style>#abc {color: white;background-color: #0471af;padding-top: 4px;padding-right: 3px;padding-bottom: 8px;padding-left: 8px;}#home {width:80%;height:80%;}#rate{color: white;font-size: 10pt;position: absolute;right: 300px;top: 40px;width: 40px;height: 20px;}.close{color: white;font-size: 15pt;position: absolute;right: 20px;top: 35px;width: 40px;height: 20px;}.redirect {margin: 50px auto; position: absolute;right: 100px;top: -20px;display: block;width: 130px;height: 50px;border: 1px solid white;background-color: rgba(255,255,255,0);color: white;font-size: 10pt;font-family: sans-serif;font-weight: bold;border-radius: 5px;transition: background-color 1000ms,color 1000ms}.redirect:hover{background-color: lightblue;color: #222;cursor: pointer;transition: background-color 1000ms,color 1000ms}</style><div id=\"abc\"><img id=\"home\" src="+ homelogoblue +"  style=\"width:195px;height:95px;\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><i>Compare</i> : <a href= \'"+lowesProduct+"\' target = \'_blank\'> <u>"+ lowesspecificationsub +"</u> </a></b>  &nbsp;for : <b style=\"font-size:20px\">$" + data.LowesSellingPrice + "</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img id=\"item\" src="+ data.LowesProductImage +"  style=\"width:95px;height:95px;\"><button type=\"button\" class=\"close\" onclick=\"$(this).parent().remove();\">x</button><form action=\'"+lowesProduct+"\' target = \'_blank\'><button class= \"redirect\" type=\"submit\">Learn More</button></form><p id=\"rate\">Rating:"+ data.LowesProductRating +"/5 ("+data.LowesProductReviewCount+" Reviews)<p></div></body></html>");

  $('body').prepend("<html><head></head><body><style>#abc {border: 1px solid black;color: white;background-color: #0471af;padding-top: 5px;padding-right: 3px;padding-bottom: 10px;padding-left: 8px;}#home {width:100%;}.close{color: white;font-size: 15pt;position: absolute;right: 20px;top: 35px;width: 40px;height: 20px;}.redirect {margin: 50px auto; position: absolute;right: 160px;top: -20px;display: block;width: 130px;height: 50px;border: 1px solid black;background-color: rgba(255,255,255,0);color: white;font-size: 10pt;font-family: sans-serif;font-weight: bold;border-radius: 5px;transition: background-color 1000ms,color 1000ms}.redirect:hover{background-color: lightblue;color: #222;cursor: pointer;transition: background-color 1000ms,color 1000ms}#rate{color: white;font-size: 10pt;position: absolute;right: 350px;top: 40px;width: 90px;height: 20px;}</style><div id=\"abc\"><img id=\"home\" src="+ homelogoblack +"  style=\"width:195px;height:95px;\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i><b>Compare</b></i> : <b><a href= \'"+lowesProduct+"\' target=\"_blank\"> <u>"+ lowesspecificationsub +"</u> </a></b>  &nbsp;for : <b><font size=\"5\">$" + data.LowesSellingPrice + "</font></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img id=\"item\" src="+ data.LowesProductImage +"  style=\"width:95px;height:95px;\"><button type=\"button\" class=\"close\" onclick=\"$(this).parent().remove();\">x</button><form action=\'"+lowesProduct+"\' target=\"_blank\"><button class= \"redirect\" type=\"submit\">Learn More</button></form><p id=\"rate\">Rating: "+ data.LowesProductRating +"/5 Reviews: ("+ data.LowesProductReviewCount +")</p></div></body></html>");
      
}





//var lowesProduct = "https://www.lowes.com"+data.LowesProductUrl;
//alert(lowesProduct);
   //myWindow=window.open('','MyNewWindow','width=400,height=200,left=1500,top=100');
       // myWindow.document.write("<html><head><title>Lowe's Price Comparision</title></head><body><h2>You can buy the same product from lowes with less price.</h2>"+"<div> Lowes Price for this product : "+data.LowesSellingPrice+"</div>"+"<div> Lowes product URL : "+lowesProduct+"</div>"+"<form><a href= '"+lowesProduct+"' onclick=window.open( '"+lowesProduct+"', 'lowes' ); return false target = _blank'>lowes product</a>"+"</form>"+"</body></html>");
       // myWindow.document.close();   
})
}



