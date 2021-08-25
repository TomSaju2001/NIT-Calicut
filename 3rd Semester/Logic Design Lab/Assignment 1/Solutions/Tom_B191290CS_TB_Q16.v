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

module Mux8x1(i1,i2,i3,i4,i5,i6,i7,i8,s0,s1,s2,o) ;

output o ;
input i1,i2,i3,i4,i5,i6,i7,i8 ;
input s2,s1,s0 ;
wire x,y ;

Mux4x1 M1(i1,i2,i3,i4,s0,s1,x) ;
Mux4x1 M2(i5,i6,i7,i8,s0,s1,y) ;
Mux2x1 M3(x,y,s2,o) ;

endmodule 

module Mux8x1_16(i1,i2,i3,i4,i5,i6,i7,i8,s,o) ;

output [15:0] o ;
input [15:0] i1,i2,i3,i4,i5,i6,i7,i8 ;
input [2:0] s ;

Mux8x1 M[15:0](i1,i2,i3,i4,i5,i6,i7,i8,s[0],s[1],s[2],o) ;

endmodule

module Stim_Tom_B191290CS_TB_Q16 ;

wire [15:0] o ;
reg [15:0] i0,i1,i2,i3,i4,i5,i6,i7 ;
reg [2:0] s ;

Mux8x1_16 M(i0,i1,i2,i3,i4,i5,i6,i7,s,o) ;

initial
begin
i0 = 6234 ; i1 = 725; i2 =7524 ; i3 = 5734 ; i4 = 8354; i5 = 28457; i6 = 2458; i7 = 2547;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 384; i1 = 398; i2 = 9337; i3 = 9353;  i4 = 2457; i5 = 8542; i6 = 3659; i7 = 2854 ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 65535 ; i1 = 274 ; i2 = 8224 ; i3 = 2457 ;  i4 = 953; i5 = 356; i6 = 82; i7 = 2485;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 136; i1 = 8564; i2 = 24377 ; i3 = 3548 ;  i4 = 428; i5 = 953; i6 = 9336 ; i7 = 524 ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 5483 ; i1 = 3485 ; i2 = 3658; i3 = 3659 ;  i4 = 572 ; i5 = 54287 ; i6 = 8542 ; i7 = 57  ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 9; i1 = 39539; i2 = 54; i3 = 4845;  i4 = 4258 ; i5 = 175 ; i6 = 35487 ; i7 = 287;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 54; i1 = 4607; i2 = 40; i3 = 749;  i4 = 248 ; i5 = 5482 ; i6 = 8642 ; i7 = 9333 ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 46; i1 = 9; i2 = 4; i3 = 4076;  i4 = 2458 ; i5 = 5724 ; i6 = 2548 ; i7 = 9635 ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 40; i1 = 459; i2 = 55875; i3 = 3856; i4 = 3648 ; i5 = 836 ; i6 = 39 ; i7 = 0 ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
i0 = 83; i1 = 8345; i2 = 86; i3 = 465;  i4 = 0  ; i5 = 685 ; i6 = 836 ; i7 = 863  ;
s = 0 ; #100 ; s = 1 ; #100 ; s = 2 ; #100 ; s = 3 ; #100 ;
s = 4 ; #100 ; s = 5 ; #100 ; s = 6 ; #100 ; s = 7 ; #100 ;
end

endmodule 
