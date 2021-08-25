module AndGate(a,b,c) ;

output c ;
input a,b ;
wire x ;

nand(x,a,b);
nand(c,x,x) ;

endmodule 

module Stim_Tom_B191290CS_TB_Q02 ;

wire c ;
reg a,b ;

AndGate AG_Out(a,b,c) ;

initial 
begin 
a = 1'b0  ; b = 1'b0 ;
#100 a = 1'b1 ; b = 1'b0 ;
#100 a = 1'b0 ; b = 1'b1 ;
#100 a = 1'b1 ; b = 1'b1 ; 
#100 ;
end

endmodule