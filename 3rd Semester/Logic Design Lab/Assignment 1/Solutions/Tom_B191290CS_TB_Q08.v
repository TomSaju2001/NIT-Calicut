module AndGate(a,b,c) ;

output c ;
input a,b ;
wire x ;

nand(x,a,b);
nand(c,x,x) ;

endmodule 

module AndGate16(a,b,c) ;

output [0:15] c ;
input [0:15] a,b ;

AndGate AG_1[0:15](a,b,c) ;

endmodule 

module Stim_Tom_B191290CS_TB_Q08 ;

wire [0:15] c;
reg [0:15] a,b ;

AndGate16 AG16_Out(a,b,c) ;

initial 
begin 
a = 100 ; b = 100 ; #100 ;
a = 200 ; b = 100 ; #100 ;
a = 235 ; b = 62 ; #100 ;
a = 3463 ; b = 63547 ; #100 ;
a = 348 ; b = 2672 ; #100 ;
a = 1953 ; b = 1180 ; #100 ;
a = 1512 ; b = 138 ; #100 ;
a = 12630 ; b = 10 ; #100 ;
end 

endmodule
