/*
 * Compressed by JSA(www.xidea.org)
 */
SyntaxHighlighter.brushes.Java=function(){var $="abstract assert boolean break byte case catch char class const "+"continue default do double else enum extends "+"false final finally float for goto if implements import "+"instanceof int interface long native new null "+"package private protected public return "+"short static strictfp super switch synchronized this throw throws true "+"transient try void volatile while";this.regexList=[{regex:SyntaxHighlighter.regexLib.singleLineCComments,css:"comments"},{regex:SyntaxHighlighter.regexLib.multiLineCComments,css:"comments"},{regex:SyntaxHighlighter.regexLib.doubleQuotedString,css:"string"},{regex:SyntaxHighlighter.regexLib.singleQuotedString,css:"string"},{regex:/\b([\d]+(\.[\d]+)?|0x[a-f0-9]+)\b/gi,css:"value"},{regex:/(?!\@interface\b)\@[\$\w]+\b/g,css:"color1"},{regex:/\@interface\b/g,css:"color2"},{regex:new RegExp(this.getKeywords($),"gm"),css:"keyword"}];this.forHtmlScript(SyntaxHighlighter.regexLib.aspScriptTags)};SyntaxHighlighter.brushes.Java.prototype=new SyntaxHighlighter.Highlighter();SyntaxHighlighter.brushes.Java.aliases=["java"]