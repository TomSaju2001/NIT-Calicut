module NotGate(a,b) ; 

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module AndGate(a,b,c) ; 

output c ;
input a,b ;
wire x ;

nand(x,a,b);
nand(c,x,x) ;

endmodule 

module OrGate(a,b,c) ; 

output c ;
input a,b ;
wire x,y ;

nand(x,a,a) ;
nand(y,b,b) ;
nand(c,x,y) ;

endmodule

module DMux1x2(c,s,a,b) ; 

output a,b ;
input s,c ;
wire s_,x1,y1,x2,y2,z ;

NotGate NG_1(s,s_) ;

AndGate AG_0(c,s_,x1) ;
AndGate AG_0_0(z,s,y1) ;
OrGate OG1(y1,x1,a) ;

AndGate AG_1(c,s,x2) ;
AndGate AG_1_0(z,s_,y2) ;
OrGate OG2(y2,x2,b) ;

endmodule 
