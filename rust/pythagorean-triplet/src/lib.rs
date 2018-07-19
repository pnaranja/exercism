extern crate rand;
use rand::prelude::*;

pub fn find() -> Option<u32> {
    loop{
        let (a, b, c) = (get_random_number(), get_random_number(), get_random_number());

        if is_triplet(a,b,c) && is_sum_1000(a,b,c){ 
            return Some (a*b*c)
        }
    }
}

fn is_triplet (a: u32, b: u32, c: u32) -> bool{
    a.pow(2)+ b.pow(2) == c.pow(2)
}

fn is_sum_1000 (a: u32, b: u32, c: u32) -> bool{
    a + b + c == 1000
}

fn get_random_number () -> u32{
    let mut rng = thread_rng();
    rng.gen_range(0,100)
}
