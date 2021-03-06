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

module Mux2x1(a,b,s,c) ;  

output c ;
input a,b,s ;
wire x,y,z ;

NotGate NG_1(s,z );
AndGate AG_1(a,z,x) ;
AndGate AG_2(b,s,y) ;
OrGate OG_1(x,y,c) ;

endmodule 

module Mux4x1(i0,i1,i2,i3,s1,s0,o) ;

output o ;
input i0,i1,i2,i3 ;
input s1,s0;
wire x,y ;

Mux2x1 M_1(i0,i1,s1,x);
Mux2x1 M_2(i2,i3,s1,y) ;
Mux2x1 M_3(x,y,s0,o) ;

endmodule

module Mux4x1_16(i0,i1,i2,i3,s,o) ;

output [15:0] o ;
input [15:0] i0,i1,i2,i3 ;
input [1:0] s ;

Mux4x1 M[15:0](i0,i1,i2,i3,s[0],s[1],o) ;

endmodule