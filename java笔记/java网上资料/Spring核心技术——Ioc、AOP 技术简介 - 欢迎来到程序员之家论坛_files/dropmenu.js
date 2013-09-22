
var monuobj = new Array();
function showmenu1(vmenuobj, depth) {
	var obj = document.getElementById(vmenuobj);
	if (obj) {
		if (monuobj[depth] && monuobj[depth] != "") {
			monuobj[depth].style.display = "none";
			monuobj[depth] = "";
		}
		obj.style.display = "block";
		window.__topPopMenuHidden = false;
		monuobj[depth] = obj;
	}
}
function hidemenu1() {
	if (monuobj[0] != null && monuobj[0] != "") {
		if (monuobj[0].style.display == "block") {
			monuobj[0].style.display = "none";
			window.__topPopMenuHidden = true;
		}
		monuobj[0] = "";
	}
}

