module NotGate(a,b) ;

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module OrGate(a,b,c) ; 

output c ;
input a,b ;
wire x,y ;

nand(x,a,a) ;
nand(y,b,b) ;
nand(c,x,y) ;

endmodule 

module NorGate(a,b,c) ;

output c ;
input a,b ;
wire x ;
OrGate OG_1(a,b,x) ;
NotGate NG_1(x,c) ;

endmodule 


module Stim_Tom_B191290CS_TB_Q04 ;

wire c ;
reg a,b ;

NorGate NG_Out(a,b,c) ;

initial 
begin 
a = 1'b0 ; b = 1'b0 ;
#100 a = 1'b1 ; b = 1'b0 ;
#100 a = 1'b0 ; b = 1'b1 ;
#100 a = 1'b1 ; b = 1'b1 ; 
#100 ;
end

endmodule 