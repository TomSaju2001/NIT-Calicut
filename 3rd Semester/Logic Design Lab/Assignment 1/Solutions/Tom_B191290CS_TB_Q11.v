module OrGate(a,b,c) ;  

output c ;
input a,b ;
wire x,y ;

nand(x,a,a) ;
nand(y,b,b) ;
nand(c,x,y) ;

endmodule

module OrGate8In(i1,i2,i3,i4,i5,i6,i7,i8,o) ; 

output o ;
input i1,i2,i3,i4,i5,i6,i7,i8;
wire a,b,w,x,y,z ;

OrGate O1(i2,i1,w) ;
OrGate O2(i4,i3,x) ;
OrGate O3(i5,i6,y) ;
OrGate O4(i7,i8,z) ;
OrGate O5(w,x,a) ;
OrGate O6(y,z,b) ;
OrGate O7(a,b,o) ;

endmodule


module Stim_Tom_B191290Cs_TB_Q11 ; 	

wire o ;
reg [7:0] i ;

OrGate8In O(i[7],i[6],i[5],i[4],i[3],i[2],i[1],i[0],o) ;

initial 
begin 
for(i=0;i<255;i=i+1)
	#100 ;
#100 ;
end

endmodule 