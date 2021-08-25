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

module Stim_Tom_B191290CS_TB_Q15 ;

wire [15:0] o ;
reg [15:0] i0,i1,i2,i3 ;
reg [1:0] s ;

Mux4x1_16 M(i0,i1,i2,i3,s,o) ;

initial
begin
i0 = 6234 ; i1 = 725; i2 =7524 ; i3 = 5734 ;
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 384; i1 = 398; i2 = 9337; i3 = 9353; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 65535 ; i1 = 274 ; i2 = 8224 ; i3 = 2457 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 136; i1 = 8564; i2 = 24377 ; i3 = 3548 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 5483 ; i1 = 3485 ; i2 = 3658; i3 = 3659 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 9; i1 = 39539; i2 = 54; i3 = 4845; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 54; i1 = 4607; i2 = 40; i3 = 749; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 46; i1 = 9; i2 = 4; i3 = 4076; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 40; i1 = 459; i2 = 55875; i3 = 3856; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
i0 = 83; i1 = 8345; i2 = 86; i3 = 465; 
s = 0 ; #100 ;
s = 1 ; #100 ;
s = 2 ; #100 ;
s = 3 ; #100 ;
end

endmodule 