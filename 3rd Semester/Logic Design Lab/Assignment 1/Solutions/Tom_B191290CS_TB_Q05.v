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

module XorGate(a,b,c) ;

output c ;
input a,b ;
wire x,y,x1,y1;

NotGate NG_1(a,x) ;
NotGate NG_2(b,y) ;
AndGate AG_1(a,y,x1) ;
AndGate AG_2(b,x,y1) ;
OrGate OG_1(x1,y1,c) ;

endmodule

module Stim_Tom_B191290CS_TB_Q05 ;

wire c ;
reg a,b ;

XorGate XG(a,b,c) ;

initial 
begin 
a = 1'b0 ; b = 1'b0 ;
#100 a = 1'b1 ; b = 1'b0 ;
#100 a = 1'b0 ; b = 1'b1 ;
#100 a = 1'b1 ; b = 1'b1 ; 
#100 ;
end

endmodule 