grammar Decoder;

@header {
package com.ppahare.antlrv4.decoder2;
}
		
prog returns [String value] : (n=expr {$value += ($n.value);})* NEWLINE*;
expr returns [String value] : n0=UNDERSCORE {$value = " ";} | n1=UNICODE {$value =  Character.toString((char)Integer.parseInt(($n1.text.replace("-26-23","").replace("-3b",""))));}| n2=NONDIGIT {$value =  "" + (char)Integer.parseInt($n2.text.replace("-",""));} | n3=LETTER {$value = $n3.text;};
UNICODE : PRE ([0-9]+) SUFF;
NONDIGIT :  '-' ([0-9a-f][0-9a-f]);
LETTER : [0-9a-z]+;
UNDERSCORE : '_';
PRE : '-26-23';
SUFF : '-3b';
NEWLINE : '\n';