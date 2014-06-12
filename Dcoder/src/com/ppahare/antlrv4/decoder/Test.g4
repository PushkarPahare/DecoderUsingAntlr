grammar Test;

@header {
package com.ppahare.antlrv4.decoder;
}
		
prog returns [String value] : (n=expr {$value += ($n.value);})* NEWLINE*;
expr returns [String value] : n0=UNDERSCORE {$value = " ";} | n1=unicode {$value = $n1.value;}| n2=nondigit {$value = $n2.value;} | n3=letter {$value = $n3.value;} | n4=digit {$value = $n4.value;};
unicode returns [String value]: PRE (DIGIT {$value = Character.toString((char)Integer.parseInt($DIGIT.text));}) SUFF;
nondigit returns [String value]: HYPHEN (TWODIGIT {$value = ""+ (char)Integer.parseInt($TWODIGIT.text,16);});
letter returns [String value]: ALPHA {$value = $ALPHA.text;};
digit returns [String value]: DIGIT {$value = $DIGIT.text;};
TWODIGIT : HEX HEX;
PRE : '-26-23';
SUFF : '-3b';
DIGIT : ('0'..'9')+;
HEX : ([0-9a-z]);
ALPHA : ('a'..'z')+;
NEWLINE : '\n';
UNDERSCORE : '_';
HYPHEN : '-';
