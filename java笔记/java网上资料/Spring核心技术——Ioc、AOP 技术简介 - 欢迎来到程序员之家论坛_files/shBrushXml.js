/*
 * Compressed by JSA(www.xidea.org)
 */
SyntaxHighlighter.brushes.Xml=function(){function $(E,B){var F=SyntaxHighlighter.Match,D=E[0],A=new XRegExp("(&lt;|<)[\\s\\/\\?]*(?<name>[:\\w-\\.]+)","xg").exec(D),$=[];if(E.attributes!=null){var C,_=new XRegExp("(?<name> [\\w:\\-\\.]+)"+"\\s*=\\s*"+"(?<value> \".*?\"|'.*?'|\\w+)","xg");while((C=_.exec(D))!=null){$.push(new F(C.name,E.index+C.index,"color1"));$.push(new F(C.value,E.index+C.index+C[0].indexOf(C.value),"string"))}}if(A!=null)$.push(new F(A.name,E.index+A[0].indexOf(A.name),"keyword"));return $}this.regexList=[{regex:new XRegExp("(\\&lt;|<)\\!\\[[\\w\\s]*?\\[(.|\\s)*?\\]\\](\\&gt;|>)","gm"),css:"color2"},{regex:new XRegExp("(\\&lt;|<)!--\\s*.*?\\s*--(\\&gt;|>)","gm"),css:"comments"},{regex:new XRegExp("(&lt;|<)[\\s\\/\\?]*(\\w+)(?<attributes>.*?)[\\s\\/\\?]*(&gt;|>)","sg"),func:$}]};SyntaxHighlighter.brushes.Xml.prototype=new SyntaxHighlighter.Highlighter();SyntaxHighlighter.brushes.Xml.aliases=["xml","xhtml","xslt","html","xhtml"]