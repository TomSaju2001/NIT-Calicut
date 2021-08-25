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

module Mux2x1_16(a,b,s,o) ; 

output [15:0] o ;
input [15:0] a,b ;
input s ;

Mux2x1 M[15:0](a,b,s,o) ;

endmodule

module Stim_Tom_B191290CS_TB_Q14 ;

wire [15:0] o ;
reg [15:0] a,b ;
reg s ;

Mux2x1_16 M(a,b,s,o) ;

initial 
begin
a = 15163 ; b = 12512 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 235; b = 7224 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 275 ; b = 3865 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 823 ; b = 9467 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 2745 ; b = 3856 ;
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 3865 ; b = 3965 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 8254 ; b = 8254 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 2548 ; b = 2854 ;
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 4658 ; b = 3956 ;
s = 0 ; #100 ;
s = 1 ; #100 ;
a = 30 ; b = 2485 ; 
s = 0 ; #100 ;
s = 1 ; #100 ;
end 

endmodule 