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


module Stim_Tom_B191290CS_TB_Q12 ;	

wire c ;
reg a,b,s ;

Mux2x1 M_1(a,b,s,c) ;

initial 
begin 
s = 1'b0 ; a = 1'b0 ; b = 1'b0 ;
#100 s = 1'b0 ; a = 1'b0 ; b = 1'b1 ;
#100 s = 1'b0 ; a = 1'b1 ; b = 1'b0 ;
#100 s = 1'b0 ; a = 1'b1 ; b = 1'b1 ;
#100 s = 1'b1 ; a = 1'b0 ; b = 1'b0 ;
#100 s = 1'b1 ; a = 1'b0 ; b = 1'b1 ;
#100 s = 1'b1 ; a = 1'b1 ; b = 1'b0 ;
#100 s = 1'b1 ; a = 1'b1 ; b = 1'b1 ;
#100 ;
end

endmodule
