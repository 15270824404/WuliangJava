
function wndClose() {
	try {
		parent.DvWnd.close();
	}
	catch (e) {
		window.close();
	}
}
function resizepic(o) {
	var maxwidth = 100;   //定义最大宽度 
	var maxheight = 100;  //定义最大高度 
	var a = new Image();
	a.src = o.src;
	if (a.width > maxwidth) {
		o.style.width = maxwidth;
	}
	if (a.height > maxheight) {
		o.style.height = maxheight;
	}
}

