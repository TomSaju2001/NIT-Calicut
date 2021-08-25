module NotGate(a,b) ;

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module Stim_Tom_B191290CS_TB_Q01 ;

wire b ;
reg a ;

NotGate NG(a,b) ;

initial 
begin
a = 1'b0 ;
#100 a = 1'b1 ;
#100 ;
end 

endmodule  