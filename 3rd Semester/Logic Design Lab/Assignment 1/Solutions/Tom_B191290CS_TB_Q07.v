module NotGate(a,b) ; 

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module NotGate16(a,b) ;

output [0:15] b ;
input [0:15] a ;

NotGate N_1[0:15](a,b);

endmodule 

module Stim_Tom_B191290CS_TB_Q07 ;

wire [0:15] b ;
reg [0:15] a ;

NotGate16 NG16_Out(a,b) ;

initial 
begin 
a = 16'b0000000000000000 ; #100 ;
a = 16'b1111111111111111 ; #100 ;
a = 16'b1010101010101010 ; #100 ;
a = 16'b0101010101010101 ; #100 ;
a = 16'b1100110011001100 ; #100 ;
a = 16'b0011001100110011 ; #100 ;
a = 3205 ; #100 ;
a = 35971 ; #100 ;
a = 9273 ; #100 ;
a = 23987 ; #100 ;
end

endmodule
